package com.leaveword.demo.Utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Response {

   private String status;
   private Object content;

    public Response(String s, String string) {
    }
}
