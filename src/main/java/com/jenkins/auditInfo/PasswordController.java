package com.jenkins.auditInfo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PasswordController {

	

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String tested(){
    		System.out.println("Hellowwwww");
    		return "test";
    }
    
    @RequestMapping(value = "/store", method = { RequestMethod.POST  })
    public String tested1(@RequestBody String buildNumber){
    		System.out.println("Hey hey Buildddd "+buildNumber);
    		return "test";
    }
   
    @RequestMapping(value = "/storeBuildInfo", method = { RequestMethod.POST  })
	public String storeBuildInfo(@RequestBody BuildInfo  buildInfo) {
    	String s= buildInfo.toString();
		System.out.println(s);
		return s;
	}
}

