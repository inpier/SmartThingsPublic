/**
 *  Copyright 2015 SmartThings
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 *
 Version 2.1 2017/06/21 Updated to make the webCoRE Radio tile act as a mute button as suggested by tommyincville
 Version 2 2017/06/03 Updated to show which Radio Station Button is On.
 
 */
metadata {
	definition (name: "Radio Stations", namespace: "smartthings/testing", author: "SmartThings/Inpier") {
		capability "Actuator"
		capability "Button"
		//capability "Holdable Button"
		capability "Configuration"
		capability "Sensor"
        //capability "Music Player"
        capability "Switch"
        
        attribute "buttonNumber","String"
        attribute "volumeUp", "String"
        attribute "volumeDown", "String"
        
        
        
        command "push1"
        command "push2"
        command "push3"
        command "push4"
        command "push5"
        command "push6"
        command "push7"
        command "push8"
        command "volup"
        command "voldown"
        command "stop"
        command "mute"
        command "unmute"
        
	}

	simulator {
		status "button 1 pushed":  "command: 2001, payload: 01"
		status "button 1 held":  "command: 2001, payload: 15"
		status "button 2 pushed":  "command: 2001, payload: 29"
		status "button 2 held":  "command: 2001, payload: 3D"
		status "button 3 pushed":  "command: 2001, payload: 51"
		status "button 3 held":  "command: 2001, payload: 65"
		status "button 4 pushed":  "command: 2001, payload: 79"
		status "button 4 held":  "command: 2001, payload: 8D"
		status "wakeup":  "command: 8407, payload: "
	}
	tiles {
		standardTile("button", "device.button0" , width: 1, height: 1, decoration: "flat") {
			state "off", label: "webCoRE Radio Station Presets", action: "mute", icon: "st.Electronics.electronics10", backgroundColor: "#ffffff"
            state "on", label: "Muted", action: "unmute", icon: "st.Electronics.electronics10", backgroundColor: "#d1e0e0"
		}
 		standardTile("push1", "device.button1", width: 1, height: 1, decoration: "flat") {
			state "off", label: "Station 1", backgroundColor: "#ffffff", action: "push1", icon: "st.Electronics.electronics16"
            state "on", label: "Station 1", backgroundColor: "#ff9933", action: "push1", icon: "st.alarm.beep.beep"
		}
 		standardTile("push2", "device.button2", width: 1, height: 1, decoration: "flat") {
			state "off", label: "Station 2", backgroundColor: "#ffffff", action: "push2", icon: "st.Electronics.electronics16"
            state "on", label: "Station 2", backgroundColor: "#ff9933", action: "push2", icon: "st.alarm.beep.beep"
		}
 		standardTile("push3", "device.button3", width: 1, height: 1, decoration: "flat") {
			state "off", label: "Station 3", backgroundColor: "#ffffff", action: "push3", icon: "st.Electronics.electronics16"
            state "on", label: "Station 3", backgroundColor: "#ff9933", action: "push3", icon: "st.alarm.beep.beep"
		}
 		standardTile("push4", "device.button4", width: 1, height: 1, decoration: "flat") {
			state "off", label: "Station 4", backgroundColor: "#ffffff", action: "push4", icon: "st.Electronics.electronics16"
            state "on", label: "Station 4", backgroundColor: "#ff9933", action: "push4", icon: "st.alarm.beep.beep"
		}
 		standardTile("volup", "device.button", width: 1, height: 1, decoration: "flat") {
			state "default", label: "Vol +", backgroundColor: "#00b359", action: "volup", icon: ""
		}
 		standardTile("push5", "device.button5", width: 1, height: 1, decoration: "flat") {
			state "off", label: "Station 5", backgroundColor: "#ffffff", action: "push5", icon: "st.Electronics.electronics16"
            state "on", label: "Station 5", backgroundColor: "#ff9933", action: "push5", icon: "st.alarm.beep.beep"
		}
 		standardTile("push6", "device.button6", width: 1, height: 1, decoration: "flat") {
			state "off", label: "Station 6", backgroundColor: "#ffffff", action: "push6", icon: "st.Electronics.electronics16"
            state "on", label: "Station 6", backgroundColor: "#ff9933", action: "push6", icon: "st.alarm.beep.beep"
		}
 		standardTile("voldown", "device.button", width: 1, height: 1, decoration: "flat") {
			state "default", label: "Vol -", backgroundColor: "#00b359", action: "voldown", icon: ""
		}
 		standardTile("push7", "device.button7", width: 1, height: 1, decoration: "flat") {
			state "off", label: "Station 7", backgroundColor: "#ffffff", action: "push7", icon: "st.Electronics.electronics16"
            state "on", label: "Station 7", backgroundColor: "#ff9933", action: "push7", icon: "st.alarm.beep.beep"
		}
 		standardTile("push8", "device.button8", width: 1, height: 1, decoration: "flat") {
			state "off", label: "Station 8", backgroundColor: "#ffffff", action: "push8", icon: "st.Electronics.electronics16"
            state "on", label: "Station 8", backgroundColor: "#ff9933", action: "push8", icon: "st.alarm.beep.beep"
		}
 		standardTile("stop", "device.button", width: 1, height: 1, decoration: "flat") {
			state "default", label: "Stop", backgroundColor: "#ff3300", action: "stop"
		}
 		
        
        
		main "button"
		//details(["push1","push2","button","push3","push4","stop","push5","push6","volup","push7","push8","voldown"])
        details(["button","push1","push2","push3","push4","volup","stop","push5","push6","push7","push8","voldown"])
	}
}

def parse(String description) {

}

def push1() {
	stop()
    sendEvent(name: "button1", value: "on")
    push(1)
}

def push2() {
	stop()
    sendEvent(name: "button2", value: "on")
    push(2)
}

def push3() {
	stop()
    sendEvent(name: "button3", value: "on")
    push(3)
}

def push4() {
    stop()
    sendEvent(name: "button4", value: "on")
	push(4)
}

def push5() {
    stop()
    sendEvent(name: "button5", value: "on")
	push(5)
}

def push6() {
    stop()
    sendEvent(name: "button6", value: "on")    
	push(6)
}

def push7() {
    stop()
    sendEvent(name: "button7", value: "on")    
	push(7)
}

def push8() {
    stop()
    sendEvent(name: "button8", value: "on")    
	push(8)
}

def change() {

 delayBetween([
  sendEvent(name: "button1", value: "off"),
  sendEvent(name: "button2", value: "off"),
  sendEvent(name: "button3", value: "off"),
  sendEvent(name: "button4", value: "off"),
  sendEvent(name: "button5",value: "off"),
  sendEvent(name: "button6", value: "off"),
  sendEvent(name: "button7", value: "off"),
  sendEvent(name: "button8", value: "off")
  ], 100)

}

def stop() {
    change()
    push(9)
}

def volup() {
	push(10)
}

def voldown() {
	push(11)
}

def mute() {
	sendEvent(name: "button0", value: "on") 
    push(12)
}

def unmute() {
	sendEvent(name: "button0", value: "off") 
    push(12)
}

private push(button) {
	log.debug "$device.displayName button $button was pushed"
	sendEvent(name: "button", value: "pushed", data: [buttonNumber: button], descriptionText: "$device.displayName button $button was pushed", isStateChange: true)
    sendEvent(name: "buttonNumber", value: "$button",  descriptionText: "", isStateChange: true)
   
}

/*private hold(button) {
	log.debug "$device.displayName button $button was held"
	sendEvent(name: "button", value: "held", data: [buttonNumber: button], descriptionText: "$device.displayName button $button was held", isStateChange: true)
     sendEvent(name: "buttonNumber", value: "$button",  descriptionText: "", isStateChange: true)
}
*/

def installed() {
	initialize()
}

def updated() {
	initialize()
}

def initialize() {
	sendEvent(name: "numberOfButtons", value: 12)
   
}