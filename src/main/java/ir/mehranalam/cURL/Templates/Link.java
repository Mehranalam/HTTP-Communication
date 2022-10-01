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

import java.io.IOException;

// We create two methods by using interfaces.
public interface Link {
    // By using this interface in other classes and packages
    // in wide dimensions, we can have an exchange with COMMANDS.
    String PASSING_TO_RUN_COMMAND_CURL_BASE(String URL) throws IOException;

    // we can access the information in cURL.lib
    // PATH : https://curl.se/libcurl/
    void SAVING_JSON_FILE_GET(String RESULT_COMMAND) throws IOException;
    // Creating a json file to send requests
    // to APIs and get the answer and convert it into a json file.
    // default : RESULT.json in local drive
}
