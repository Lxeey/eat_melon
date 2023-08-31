/**
  * Copyright 2023 bejson.com 
  */
package com.eat.melon.melon1.model;

/**
 * Auto-generated: 2023-08-30 16:28:0
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Layer_config {

    private Tags tags;
    private boolean is_critical;
    private Layer_mask layer_mask;
    public void setTags(Tags tags) {
         this.tags = tags;
     }
     public Tags getTags() {
         return tags;
     }

    public void setIs_critical(boolean is_critical) {
         this.is_critical = is_critical;
     }
     public boolean getIs_critical() {
         return is_critical;
     }

    public void setLayer_mask(Layer_mask layer_mask) {
         this.layer_mask = layer_mask;
     }
     public Layer_mask getLayer_mask() {
         return layer_mask;
     }

}