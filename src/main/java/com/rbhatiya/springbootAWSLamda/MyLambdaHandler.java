package com.rbhatiya.springbootAWSLamda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.gson.Gson;
import com.rbhatiya.springbootAWSLamda.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

public class MyLambdaHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private static ConfigurableApplicationContext applicationContext;

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
        if (applicationContext == null) {
            applicationContext = SpringApplication.run(SpringbootAwsLamdaApplication.class);
        }

        // Get the controller response
        List responseBody = applicationContext.getBean(UserController.class).getUser();
        Gson respBody = new Gson();
        String json = respBody.toJson(responseBody);

        // Create a response object
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
        response.setStatusCode(200);
        response.setBody(json);

        return response;
    }


}
