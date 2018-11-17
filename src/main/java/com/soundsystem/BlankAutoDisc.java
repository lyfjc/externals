package com.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class BlankAutoDisc {

  private final String title;
  private final String artist;

  public BlankAutoDisc( String title,
                         String artist) {
    this.title = title;
    this.artist = artist;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getArtist() {
    return artist;
  }
  
}
