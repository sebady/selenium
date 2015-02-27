/*
Copyright 2007-2009 Selenium committers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package org.openqa.selenium.support.events;

import org.openqa.selenium.interactions.internal.Coordinates;


/**
 * Use this class as base class, if you want to implement a {@link org.openqa.selenium.support.events.WebDriverActionEventListener}
 * and are only interested in some events. All methods provided by this class have an empty method body.
 */
public abstract class AbstractWebDriverActionListener implements WebDriverActionEventListener {

  public void beforePressKey(CharSequence... keysToSend) {
    // Do nothing
  }

  public void afterPressKey(CharSequence... keysToSend) {
    // Do nothing
  }

  public void beforeReleaseKey(CharSequence... keysToSend) {
    // Do nothing
  }

  public void afterReleaseKey(CharSequence... keysToSend) {
    // Do nothing
  }

  public void beforeSendKeys(CharSequence... keysToSend) {
    // Do nothing
  }

  public void afterSendKeys(CharSequence... keysToSend) {
    // Do nothing
  }

  public void beforeClick(Coordinates where) {
    // Do nothing
  }

  public void afterClick(Coordinates where) {
    // Do nothing
  }

  public void beforeDoubleClick(Coordinates where) {
    // Do nothing
  }

  public void afterDoubleClick(Coordinates where) {
    // Do nothing
  }

  public void beforeMouseDown(Coordinates where) {
    // Do nothing
  }

  public void afterMouseDown(Coordinates where) {
    // Do nothing
  }

  public void beforeMouseUp(Coordinates where) {
    // Do nothing
  }

  public void afterMouseUp(Coordinates where) {
    // Do nothing
  }

  public void beforeMouseMove(Coordinates where) {
    // Do nothing
  }

  public void afterMouseMove(Coordinates where) {
    // Do nothing
  }

  public void beforeMouseMove(Coordinates where, long xOffset, long yOffset) {
    // Do nothing
  }

  public void afterMouseMove(Coordinates where, long xOffset, long yOffset) {
    // Do nothing
  }

  public void beforeContextClick(Coordinates where) {
    // Do nothing
  }

  public void afterContextClick(Coordinates where) {
    // Do nothing
  }

}
