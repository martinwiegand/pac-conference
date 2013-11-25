package com.prodyna.pac.conference.speaker.service;

import com.prodyna.pac.conference.exception.ConferenceServiceException;
import com.prodyna.pac.conference.speaker.model.Speaker;

/**
 * Exception which indicates, that an instance of {@link Speaker} is still
 * referenced by another entity.
 * 
 * @author Martin Schwietzke, PRODYNA AG
 * 
 */
public class SpeakerReferencedException extends ConferenceServiceException {

	private static final long serialVersionUID = 1L;

}