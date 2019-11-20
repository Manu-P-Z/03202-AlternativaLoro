/* 
 * Copyright 2019 Manu Portolés Zagalá.
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
 */
package org.japo.java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        final String MSG_SOC = "¡Ave César!";
        final String MSG_EXT = "¡Sócrates socorro!";
        final String AMO = "Sócrates";

        //Variables
        String persEntra;
        String mensLoro;

        //EntCons
        persEntra = SCN.nextLine();

        //Comp
        if (persEntra.equals(AMO)) {
            mensLoro = MSG_SOC;
        } else {

        }
        mensLoro = MSG_EXT;
    }

}
