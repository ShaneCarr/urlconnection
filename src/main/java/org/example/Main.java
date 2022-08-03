import java.net.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        URL url = new URL("https://a830edad9050849930e22073007-my.spoppe.com/personal/admin_a830edad9050849930e22073007_ccsctp_net/_api/v2.0/sites('root')/lists/");
        String data = "{\n  \"title\": \"Story_files_lib6_java_version\",\n  \"displayName\": \"Story_files_lib6_java_version\",\n  \"list\": {\n    \"template\": \"DocumentLibrary\"\n  }\n}";

        byte[] out = data.toString().getBytes("UTF-8");

        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        try {
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            conn.setDoOutput(true);
            conn.setRequestProperty("Authorization", "MSAuth1.0 actortoken=\"Bearer eyJ0eXAiOiJKV1QiLCJub25jZSI6IkVIZE5WRUs0SElzN2hfUTR4aE9nSWdWYTg4MmpkSlFpdVpXMU42LXF5T28iLCJhbGciOiJSUzI1NiIsIng1dCI6IlRGN1hTWFZ6ellOUDc3S0x5ZUZpamJsSmdVWSIsImtpZCI6IlRGN1hTWFZ6ellOUDc3S0x5ZUZpamJsSmdVWSJ9.eyJhdWQiOiJodHRwczovL2E4MzBlZGFkOTA1MDg0OTkzMGUyMjA3MzAwNy1teS5zcG9wcGUuY29tLyIsImlzcyI6Imh0dHBzOi8vc3RzLndpbmRvd3MtcHBlLm5ldC8wNWFiMGMxNS1jMGVkLTQ4NjYtYTM4Yy1jYmVjZjM3ODgxYTIvIiwiaWF0IjoxNjU5NDc4Njg3LCJuYmYiOjE2NTk0Nzg2ODcsImV4cCI6MTY1OTU2NTM4NywiYWlvIjoiRTJNQUFxZVZtODJYUGJXZFpiSlk4Z3REOXhjQSIsImFwcF9kaXNwbGF5bmFtZSI6IllhbW1lciIsImFwcGlkIjoiMDAwMDAwMDUtMDAwMC0wZmYxLWNlMDAtMDAwMDAwMDAwMDAwIiwiYXBwaWRhY3IiOiIyIiwiaWRwIjoiaHR0cHM6Ly9zdHMud2luZG93cy1wcGUubmV0LzA1YWIwYzE1LWMwZWQtNDg2Ni1hMzhjLWNiZWNmMzc4ODFhMi8iLCJpZHR5cCI6ImFwcCIsIm9pZCI6IjhkNzg1ZDUyLTkwZDktNDRjMS04YjI1LTQ5OTJkODZkMDUxZiIsInJoIjoiMC5BQUFBRlF5ckJlM0Faa2lqak12czgzaUJvZ01BQUFBQUFQRVB6Z0FBQUFBQUFBQUJBQUEuIiwic2lkIjoiYjBkZjRlZGQtYTljYi00YjE2LWI5YzUtODEzNGUzZDc4NjEyIiwic3ViIjoiOGQ3ODVkNTItOTBkOS00NGMxLThiMjUtNDk5MmQ4NmQwNTFmIiwidGlkIjoiMDVhYjBjMTUtYzBlZC00ODY2LWEzOGMtY2JlY2YzNzg4MWEyIiwidXRpIjoiY1dZRXJkV0hVRVNJYnQ1UVFvb0VBQSIsInZlciI6IjEuMCJ9.dUrumvLti41Yg4nhe5mytbV-w_KxqmE3uuj_hPNyIJv3sK1xEINbKbxDaTDz9thkrrNykfZaYhtDYhEt9-3j-boLB2IUEI97TZBTFUwYyCu07UUskYa5FfQX5RAMK0L4ZKYsI2VShdMH6dBRUX1-LwO9og3TARJym3-t9P33cgkn94ia65m9rbISV3EYhdyRgGjafvDyF4s7gctpr93Hs7KB8x_Lc8zGIuyvhRf6mxdUkAMY_4GISMF420nMn2TB8mqTnCUBC3TmONdjFHtftvtHG1qNdV67WEEDnr2t1FaSiHlhEPMhfKVYlV53v7yKFK21AQjPQZqxl23AB71zbg\", accesstoken=\"Bearer eyJ0eXAiOiJKV1QiLCJub25jZSI6Ii1pd1dfNVM0ejRWS2pYRnhZeF9mLXhNUjMyU1VscV9HRDZMUVRtWmN1QXMiLCJhbGciOiJSUzI1NiIsIng1dCI6IlRGN1hTWFZ6ellOUDc3S0x5ZUZpamJsSmdVWSIsImtpZCI6IlRGN1hTWFZ6ellOUDc3S0x5ZUZpamJsSmdVWSJ9.eyJhdWQiOiJodHRwczovL3d3dy5zdGFnaW5nLnlhbW1lci5jb20vIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2luZG93cy1wcGUubmV0LzA1YWIwYzE1LWMwZWQtNDg2Ni1hMzhjLWNiZWNmMzc4ODFhMi8iLCJpYXQiOjE2NTk0Nzk2MTAsIm5iZiI6MTY1OTQ3OTYxMCwiZXhwIjoxNjU5NDg0ODQ4LCJhY3IiOiIxIiwiYWlvIjoiQVNRQTIvOFdBQUFBRU1qamcrTmM2TnJNTXpCWDVkdkMwLzRlZjN0NElsd0pzenh5OWNyT3JDQT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMDAwMDAwMDUtMDAwMC0wZmYxLWNlMDAtMDAwMDAwMDAwMDAwIiwiYXBwaWRhY3IiOiIwIiwiZmFtaWx5X25hbWUiOiJEb2UiLCJnaXZlbl9uYW1lIjoiSm9obiIsImlwYWRkciI6IjI0LjE5LjE2OC45NyIsIm5hbWUiOiJURVNUX1RFU1RfU1BPUHJvdkhlYXJ0YmVhdF9FM18xNV8yMjA3MzAwNzAwXzE5MzAiLCJvaWQiOiIyYzQ3ODc5Ny02Njk3LTRlNzAtYWJkMC0yZTM4MGIxNmE1MTQiLCJwdWlkIjoiMTAwM0RGRkQwMTdBMzM0MiIsInJoIjoiMC5BQUFBRlF5ckJlM0Faa2lqak12czgzaUJvZ1VBQUFBQUFQRVB6Z0FBQUFBQUFBQUJBRU0uIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiQWszM1BiUjFEQUtEVTduTHFVRmhESFFqUzJxZ3J0YjdURUR6RW1UMUM3USIsInRpZCI6IjA1YWIwYzE1LWMwZWQtNDg2Ni1hMzhjLWNiZWNmMzc4ODFhMiIsInVuaXF1ZV9uYW1lIjoiYWRtaW5AYTgzMGVkYWQ5MDUwODQ5OTMwRTIyMDczMDA3LmNjc2N0cC5uZXQiLCJ1cG4iOiJhZG1pbkBhODMwZWRhZDkwNTA4NDk5MzBFMjIwNzMwMDcuY2NzY3RwLm5ldCIsInV0aSI6IklvZmhlWENzdlV1YWdoUzJjc2tGQUEiLCJ2ZXIiOiIxLjAifQ.rgYnLzRh5P6CCU0cHWeOqP5cICdqCkdDKR9nkIvwDBA4I7chhJYmh0dLmacMxr7YlP5bGLfj0Yeisoo81x_hQpJTXuviTHKe6Ih9yI5WH5Go06n0wHJ-6Q2EnObm4g2QJsy0v2qY1dZgH1iuLjaox3HUyQH1ExLPiQ_2qCDifCQe1bxtcIFLf-Ovzh9y4n_CHwHUGnIVlv3N1WTlIq-jDpe0pkiGw6O9qIbCWkyEzQptUxbAkngh2a2iAcCn7abxk3wlj6EjGiQK_ZbJqmhHHC5ppZUQNJpifTL5Y7pQDS4-T0xW0TItHxS90BYADoPldho4jLCUKvcw9Ke7a22Eeg\", type=\"PFAT\"");
            conn.setRequestProperty("Content-Type", "application/json");

            try (OutputStream os = conn.getOutputStream()) {
                os.write(out, 0, out.length);
                os.flush();
            }

            System.out.println(conn.getResponseCode() + " " + conn.getResponseMessage());
        }
        finally {
            conn.disconnect();
        }
    }
}