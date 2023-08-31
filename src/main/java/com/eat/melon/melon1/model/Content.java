/**
  * Copyright 2023 bejson.com 
  */
package com.eat.melon.melon1.model;
import java.util.List;

/**
 * Auto-generated: 2023-08-30 16:28:0
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Content {

    private String message;
    private List<String> members;
    private Emote emote;
    private Jump_url jump_url;
    private int max_line;
    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setMembers(List<String> members) {
         this.members = members;
     }
     public List<String> getMembers() {
         return members;
     }

    public void setEmote(Emote emote) {
         this.emote = emote;
     }
     public Emote getEmote() {
         return emote;
     }

    public void setJump_url(Jump_url jump_url) {
         this.jump_url = jump_url;
     }
     public Jump_url getJump_url() {
         return jump_url;
     }

    public void setMax_line(int max_line) {
         this.max_line = max_line;
     }
     public int getMax_line() {
         return max_line;
     }

}