package com.rbhatiya.springbootAWSLamda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import java.util.Collections;
import java.util.Map;

public class GetItemFunction implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    public static final String ENV_TABLE_NAME = "TABLE";


    public GetItemFunction() {
    }

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
        String response = "This is remo for handle request";

        return new APIGatewayProxyResponseEvent().withStatusCode(200)
                .withHeaders(Collections.emptyMap())
                .withBody(response);
    }
}