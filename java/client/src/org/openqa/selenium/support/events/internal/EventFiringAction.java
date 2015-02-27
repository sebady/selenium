package org.openqa.selenium.support.events.internal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.events.WebDriverActionEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * An Action interaction that fires events.
 */
public class EventFiringAction implements Keyboard, Mouse {
  private final WebDriver driver;
  private final WebDriverActionEventListener dispatcher;
  private final Keyboard keyboard;
  private final Mouse mouse;

  public EventFiringAction(WebDriver driver, WebDriverActionEventListener dispatcher) {
    this.driver = driver;
    this.dispatcher = dispatcher;
    this.mouse = ((HasInputDevices) this.driver).getMouse();
    this.keyboard = ((HasInputDevices) this.driver).getKeyboard();
  }

  public void sendKeys(CharSequence... keysToSend) {
    if (dispatcher == null) {
      keyboard.sendKeys(keysToSend);
    } else {
      dispatcher.beforeSendKeys(keysToSend);
      keyboard.sendKeys(keysToSend);
      dispatcher.afterSendKeys(keysToSend);
    }
  }

  public void pressKey(CharSequence keyToPress) {
    if (dispatcher == null) {
      keyboard.pressKey(keyToPress);
    } else {
      dispatcher.beforePressKey(keyToPress);
      keyboard.pressKey(keyToPress);
      dispatcher.afterPressKey(keyToPress);
    }
  }

  public void releaseKey(CharSequence keyToRelease) {
    if (dispatcher == null) {
      keyboard.releaseKey(keyToRelease);
    } else {
      dispatcher.beforeReleaseKey(keyToRelease);
      keyboard.releaseKey(keyToRelease);
      dispatcher.afterReleaseKey(keyToRelease);
    }
  }
  public void click(Coordinates where) {
    if (dispatcher == null) {
      mouse.click(where);
    } else {
      dispatcher.beforeClick(where);
      mouse.click(where);
      dispatcher.afterClick(where);
    }
  }

  public void doubleClick(Coordinates where) {
    if (dispatcher == null) {
      mouse.doubleClick(where);
    } else {
      dispatcher.beforeDoubleClick(where);
      mouse.doubleClick(where);
      dispatcher.afterDoubleClick(where);
    }
  }

  public void mouseDown(Coordinates where) {
    if (dispatcher == null) {
      mouse.mouseDown(where);
    } else {
      dispatcher.beforeMouseDown(where);
      mouse.mouseDown(where);
      dispatcher.afterMouseDown(where);
    }
  }

  public void mouseUp(Coordinates where) {
    if (dispatcher == null) {
      mouse.mouseUp(where);
    } else {
      dispatcher.beforeMouseUp(where);
      mouse.mouseUp(where);
      dispatcher.afterMouseUp(where);
    }
  }

  public void mouseMove(Coordinates where) {
    if (dispatcher == null) {
      mouse.mouseMove(where);
    } else {
      dispatcher.beforeMouseMove(where);
      mouse.mouseMove(where);
      dispatcher.afterMouseMove(where);
    }
  }

  public void mouseMove(Coordinates where, long xOffset, long yOffset) {
    if (dispatcher == null) {
      mouse.mouseMove(where, xOffset, yOffset);
    } else {
      dispatcher.beforeMouseMove(where, xOffset, yOffset);
      mouse.mouseMove(where, xOffset, yOffset);
      dispatcher.afterMouseMove(where, xOffset, yOffset);
    }
  }

  public void contextClick(Coordinates where) {
    if (dispatcher == null) {
      mouse.contextClick(where);
    } else {
      dispatcher.beforeContextClick(where);
      mouse.contextClick(where);
      dispatcher.afterContextClick(where);
    }
  }
}
