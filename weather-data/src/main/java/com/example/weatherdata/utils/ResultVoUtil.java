package com.example.weatherdata.utils;

import com.example.weatherdata.vo.ResultVo;

/**
 * @author CookiesEason
 * 2018/04/22 14:55
 */
public class ResultVoUtil {

    public static ResultVo error(Integer code, String msg){
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
