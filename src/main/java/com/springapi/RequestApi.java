package com.springapi;

import com.com.tools.Tools;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Xuxinguang on 2019/2/28.
 */

@CrossOrigin
@RestController
public class RequestApi {

    @RequestMapping(value = "/getRequest",method = RequestMethod.GET)
    public String getRequest(@RequestParam(value = "name") String name){
        Tools tools = new Tools();
        String res = tools.doGet("https://api.apiopen.top/searchAuthors","name="+name+"");
        return res;
    }


    @RequestMapping(value = "/postRequest",method = RequestMethod.POST)
    public String postRequest(@RequestParam(value = "name",required = true) String name){
        Tools tools = new Tools();
        String res = tools.doPost("https://www.apiopen.top/weatherApi","city="+name+"");
        return res;
    }


}
