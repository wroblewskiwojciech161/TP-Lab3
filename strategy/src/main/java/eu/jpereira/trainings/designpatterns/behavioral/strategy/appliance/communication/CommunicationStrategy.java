/**
 * Copyright 2011 Joao Miguel Pereira
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.jpereira.trainings.designpatterns.behavioral.strategy.appliance.communication;

/**
 * 
 * Defines the Interfaces for all the Connection Strategies
 * 
 * @author jpereira
 * 
 */
public interface CommunicationStrategy {

	/**
	 * Open a connection to the appliance so it can send requests
	 * 
	 * @param properties
	 */
	void connect(ConnectionProperties properties);

	/**
	 * Sends the request to the physical appliance
	 * 
	 * @param request
	 */
	void sendRequest(Request request);

	/**
	 * Disconnect from the physical appliance
	 */
	void disconnect();
}