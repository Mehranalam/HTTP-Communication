/*
 * Copyright (C) 2022 Mehranalam, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Version 1.0.0
 */

package ir.mehranalam.cURL;


import ir.mehranalam.cURL.Templates.Commands;
import ir.mehranalam.cURL.Templates.Link;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GET implements Link {
    String URL;
    // Sending requests under GET in curl will be sent like this
    // and the data will be displayed in string format.
    // https://everything.curl.dev/http/basics
    private final String PATTERN = "curl -X GET ";
    // Creating a single instance for continuous use of Commands class operations
    private final Commands GET_OPERATION = new Commands();

    // Making this constructor is for this purpose
    // to receive the URL in the core of this library.
    public void SET_GET(String URL) {
        this.URL = URL;
    }

    // Receive Jason data under text (string) to exchange
    // it with other methods and send the request faster in order to avoid wasting time.
    @Override
    public String PASSING_TO_RUN_COMMAND_CURL_BASE(String URL) throws IOException {
        Process RESPONSE_TO_REQUEST = GET_OPERATION
                .RUN_COMMAND_CURL_BASE(PATTERN + URL);
        GET_OPERATION.GET_METHOD_CURL_BASE(RESPONSE_TO_REQUEST);
        // Return the requested data
        return GET_OPERATION.STORE_DATA.get(0);
    }

    @Override
    public void SAVING_JSON_FILE_GET(String RESULT_COMMAND) throws IOException {
        // Convert response to a json file
        // for easier access to API data and other examples
        File CREATE_DPX = new
                File("RESULT.json");
        CREATE_DPX.createNewFile();
        // default : RESULT.json in local drive
        FileWriter BODY = new
                FileWriter(CREATE_DPX.getName());
        BODY.write(RESULT_COMMAND);
    }
}
