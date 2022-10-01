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

package ir.mehranalam;


import ir.mehranalam.cURL.GET;
import ir.mehranalam.cURL.POST;

import java.io.IOException;

public class Core extends ExceptionHandler {

    // Required access to create the .json file in the device's local memory
    private boolean ACCESS_TO_SAVE_JSON_FILE = false; // default this is FALSE.

    @Override
    void RESOLVE_TIME() {
        // The time of sending and receiving the request may
        // be a little more than expected.A Waiter should be
        // installed for this waste of time and work when necessary.
    }

    @Override
    void BAD_INPUT(String RESULT_COMMAND) {
        // In some cases, users may make inappropriate entries and wrong URLs,
        // in this case the CURL output will not be interesting, so this should be handled.
    }

    @Override
    void NOT_EXISTED_JSON_FILE() {
        // When you request to receive the json file, you set it equal to true,
        // there may already be a file with this name, as a result,
        // it will cause various exceptions.
    }

    private GET SEND_REQUESTS_UNDER_GET_PROTOCOL;
    private POST SEND_DATA_UNDER_POST_PROTOCOL;

    private Core(boolean ACCESS_TO_SAVE_JSON_FILE,
                 GET SEND_REQUESTS_UNDER_GET_PROTOCOL,
                 POST SEND_DATA_UNDER_POST_PROTOCOL) {
        // Indirect initialization of the Core constructor safely by an interface function.
        this.SEND_REQUESTS_UNDER_GET_PROTOCOL = SEND_REQUESTS_UNDER_GET_PROTOCOL;
        this.SEND_DATA_UNDER_POST_PROTOCOL = SEND_DATA_UNDER_POST_PROTOCOL;
        this.ACCESS_TO_SAVE_JSON_FILE = ACCESS_TO_SAVE_JSON_FILE;
    }

    public Core Builder(boolean ACCESS_TO_SAVE_JSON_FILE) {
        // Continuous sampling of classes and indirect and safe access
        // to the core class for information exchange
        // in this part of the data is made and classified regularly
        // and at the same time so that it is possible to read the source code
        // and use it in the best possible way.
        return new Core(ACCESS_TO_SAVE_JSON_FILE,
                new GET(),
                new POST());
    }

    String USE_GET_PROTOCOL(String URL) throws IOException {
        SEND_REQUESTS_UNDER_GET_PROTOCOL.SET_GET(URL);
        return SEND_REQUESTS_UNDER_GET_PROTOCOL
                .PASSING_TO_RUN_COMMAND_CURL_BASE(URL);
    }
}
