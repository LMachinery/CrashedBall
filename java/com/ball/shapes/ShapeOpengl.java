package com.ball.shapes;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class ShapeOpengl extends Shape{

    private FloatBuffer mShapePositions;
    private FloatBuffer mShapeColors;
    private FloatBuffer mShapeNormals;
    private FloatBuffer mShapeTextureCoordinates;

    private final int mBytesPerFloat = 4;
    private final int mPositionDataSize = 3;
    private final int mColorDataSize = 4;
    private final int mNormalDataSize = 3;
    private final int mTextureCoordinateDataSize = 2;

    //The texture pointer
    private int[] texturePointers = new int[1];

    public ShapeOpengl(float cx, float cy, float cz){
        super(cx,cy,cz);
    }

    public ShapeOpengl(){

    }

    public void draw(int mPositionHandle,int mColorHandle,int mNormalHandle,int mTextureCoordinateHandle,int mTextureUniformHandle,int mMVMatrixHandle,int mLightPosHandle,int mMVPMatrixHandle,float[] mMVPMatrix,float[] mViewMatrix,float[] mModelMatrix,float[] mProjectionMatrix,float[] mLightPosInEyeSpace)
    {
        transformationObject(mModelMatrix);
        // Tell the texture uniform sampler to use this texture in the shader by binding to texture unit 0.
        GLES20.glUniform1i(mTextureUniformHandle, 0);

        // Set the active texture unit to texture unit 0.
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
        // Bind the texture to this unit.
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, texturePointers[indexTexture]);

        // Pass in the position information
        mShapePositions.position(0);
        GLES20.glVertexAttribPointer(mPositionHandle, mPositionDataSize, GLES20.GL_FLOAT, false,
                0, mShapePositions);
        GLES20.glEnableVertexAttribArray(mPositionHandle);

        // Pass in the color information
        mShapeColors.position(0);
        GLES20.glVertexAttribPointer(mColorHandle, mColorDataSize, GLES20.GL_FLOAT, false,
                0, mShapeColors);
        GLES20.glEnableVertexAttribArray(mColorHandle);

        // Pass in the normal information
        mShapeNormals.position(0);
        GLES20.glVertexAttribPointer(mNormalHandle, mNormalDataSize, GLES20.GL_FLOAT, false,
                0, mShapeNormals);

        GLES20.glEnableVertexAttribArray(mNormalHandle);

        // Pass in the texture coordinate information
        mShapeTextureCoordinates.position(0);
        GLES20.glVertexAttribPointer(mTextureCoordinateHandle, mTextureCoordinateDataSize, GLES20.GL_FLOAT, false,
                0, mShapeTextureCoordinates);

        GLES20.glEnableVertexAttribArray(mTextureCoordinateHandle);

        // This multiplies the view matrix by the model matrix, and stores the result in the MVP matrix
        // (which currently contains model * view).
        Matrix.multiplyMM(mMVPMatrix, 0, mViewMatrix, 0, mModelMatrix, 0);

        // Pass in the modelview matrix.
        GLES20.glUniformMatrix4fv(mMVMatrixHandle, 1, false, mMVPMatrix, 0);

        // This multiplies the modelview matrix by the projection matrix, and stores the result in the MVP matrix
        // (which now contains model * view * projection).
        Matrix.multiplyMM(mMVPMatrix, 0, mProjectionMatrix, 0, mMVPMatrix, 0);

        // Pass in the combined matrix.
        GLES20.glUniformMatrix4fv(mMVPMatrixHandle, 1, false, mMVPMatrix, 0);

        // Pass in the light position in eye space.
        GLES20.glUniform3f(mLightPosHandle, mLightPosInEyeSpace[0], mLightPosInEyeSpace[1], mLightPosInEyeSpace[2]);
        // Draw the cube.
        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, vertices.length / 3);
    }

    @Override
    public void setVertex(float[] vertices){
        super.setVertex(vertices);
        ByteBuffer bb = ByteBuffer.allocateDirect(vertices.length * 4);
        bb.order(ByteOrder.nativeOrder());
        mShapePositions = bb.asFloatBuffer();
        mShapePositions.put(vertices);
        mShapePositions.position(0);
    }

    @Override
    public void setVertexTextureCoordinates(float[] textureCoordinates){
        super.setVertexTextureCoordinates(textureCoordinates);
        // The texture buffer
        ByteBuffer bb2 = ByteBuffer.allocateDirect(textureCoordinates.length * 4);
        bb2.order(ByteOrder.nativeOrder());
        mShapeTextureCoordinates = bb2.asFloatBuffer();
        mShapeTextureCoordinates.put(textureCoordinates);
        mShapeTextureCoordinates.position(0);
    }

    @Override
    public void setRGBA(float rojo,float verde,float azul,float transparencia){
        super.setRGBA(rojo,verde,azul,transparencia);
        ByteBuffer cb = ByteBuffer.allocateDirect(colors.length * 4);
        cb.order(ByteOrder.nativeOrder());
        mShapeColors = cb.asFloatBuffer();
        mShapeColors.put(colors);
        mShapeColors.position(0);
    }

    public void calculateNormals(){
        super.calculateNormals();
        setNormals(normals);
    }

    public void setNormals(float normals[]){
        this.normals = normals;
        ByteBuffer cb = ByteBuffer.allocateDirect(normals.length * 4);
        cb.order(ByteOrder.nativeOrder());
        mShapeNormals = cb.asFloatBuffer();
        mShapeNormals.put(normals);
        mShapeNormals.position(0);
    }

    private void transformationObject(float[] mModelMatrix){
        Matrix.setIdentityM(mModelMatrix, 0);
        Matrix.translateM(mModelMatrix, 0, getX(), getY()+despYSinColision, getZ());
        float xRotationVector[] = {1.0f, 0.0f, 0.0f};
        float yRotationVector[] = {0.0f, 1.0f, 0.0f};
        float zRotationVector[] = {0.0f, 0.0f, 1.0f};
        for(int i=0;i<orderRotation.size();i++){
            if (orderRotation.get(i).equals("X")){
                if (animator.getAngleX() != 0){
                    Matrix.rotateM(mModelMatrix, 0, (int) animator.getAngleX(), xRotationVector[0], xRotationVector[1], xRotationVector[2]);
                }
            }
            else if (orderRotation.get(i).equals("Y")){
                if (animator.getAngleY() != 0){
                    Matrix.rotateM(mModelMatrix, 0, (int)animator.getAngleY(), yRotationVector[0], yRotationVector[1], yRotationVector[2]);
                }
            }
            else if (orderRotation.get(i).equals("Z")){
                if (animator.getAngleZ() != 0){
                    Matrix.rotateM(mModelMatrix, 0, (int)animator.getAngleZ(), zRotationVector[0], zRotationVector[1], zRotationVector[2]);
                }
            }
        }
        if (animator.getScale() != 1){
            Matrix.scaleM(mModelMatrix,0, (float)animator.getScale(),(float)animator.getScale(),(float)animator.getScale());
        }
    }

    public int[] getTexturePointers() {
        return texturePointers;
    }

    public void setTexturePointers(int[] texturePointers) {
        this.texturePointers = texturePointers;
    }

    public FloatBuffer getmShapePositions() {
        return mShapePositions;
    }

    public FloatBuffer getmShapeColors() {
        return mShapeColors;
    }

    public FloatBuffer getmShapeNormals() {
        return mShapeNormals;
    }

    public FloatBuffer getmShapeTextureCoordinates() {
        return mShapeTextureCoordinates;
    }


}
