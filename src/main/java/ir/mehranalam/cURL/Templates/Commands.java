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

package ir.mehranalam.cURL.Templates;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Commands {

    public ArrayList<String> STORE_DATA = new ArrayList<>();
    // We collect terminal data by creating a data collection of arrays.

    public Process RUN_COMMAND_CURL_BASE(String command) throws IOException {
        // How to connect cURL to the terminal
        // to send a request using PROCESS BUILDER
        return Runtime.getRuntime().exec(command);
    }

    public void GET_METHOD_CURL_BASE(@NotNull Process builder) throws IOException {
        // By reading information and exchanging
        // it with the terminal in the
        // shortest possible time : https://curl.se/docs/httpscripting.html
        BufferedReader ReadLineOfCurlBuffer = new BufferedReader(
                new InputStreamReader(builder.getInputStream())
        );
        String lineOfResponseGET;
        /*
        By checking the non-null status of
        the inputs and outputs, sending the request in the
        form of a Javanese shell is completed.
         */
        while ((lineOfResponseGET = ReadLineOfCurlBuffer.readLine()) != null) {
            STORE_DATA.add(lineOfResponseGET);
        }
    }
}
