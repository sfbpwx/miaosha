package com.miaoshaproject.error;

public class EmBusinessError implements CommonError{

    //通用错误码00001
   // PARAMETER_VALID_
    //所有1开头的
    //USER_NOT_EXIST(10001,"用户不存在");

    private EmBusinessError(int errCode,String errMsg){
        this.errCode=errCode;
        this.errMsg=errMsg;
    }
    private int errCode;
    private String errMsg;
    @Override
    public int getErrorCode() {
        return this.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.getErrorMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg=errMsg;
        return this;
    }
}
