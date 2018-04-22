package com.example.weatherdata.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

/**
 * @author CookiesEason
 * 2018/04/22 14:51
 */
@Data
public class ResultVo implements Serializable {

    private static final long serialVersionUID = 430185373222528745L;

    /**错误码 */
    private Integer code;

    /**提示信息*/
    private String msg;

}
