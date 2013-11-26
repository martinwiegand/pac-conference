package com.prodyna.pac.conference.room.service;

import java.util.List;

import com.prodyna.pac.conference.common.exception.ConferenceServiceException;
import com.prodyna.pac.conference.room.model.Room;

/**
 * 
 * Service interface for managing {@link Room} entities.
 * 
 * @author Martin Schwietzke, PRODYNA AG
 * 
 */
public interface RoomService {

	/**
	 * Creates and stores a new {@link Room}.
	 * 
	 * @param room
	 *            The room to create.
	 * @return The created room instance.
	 * @throws ConferenceServiceException
	 *             Thrown on error while creating new {@link Room}.
	 */
	Room createRoom(Room room) throws Exception;

	/**
	 * Deletes the given room.
	 * 
	 * @param room
	 *            The {@link Room} to delete.
	 * @throws ConferenceServiceException
	 *             Thrown on error while deleting the room.
	 */
	void deleteRoom(Room room) throws RoomReferencedException, Exception;

	/**
	 * Updates the given room.
	 * 
	 * @param room
	 *            The room to persist.
	 * @throws ConferenceServiceException
	 *             Thrown on error while updating the room.
	 */
	Room updateRoom(Room room) throws Exception;

	/**
	 * Fetches a {@link Room} by it's identifier.
	 * 
	 * @param roomId
	 *            The id of the {@link Room} to fetch.
	 * @return An instance of {@link Room} or <code>null</code> if no room
	 *         exists with the given roomId.
	 * @throws ConferenceServiceException
	 *             Thrown on error when loading the room.
	 */
	Room getRoomById(long roomId) throws Exception;

	/**
	 * Loads all rooms.
	 * 
	 * @return A {@link List} of all rooms.
	 * @throws ConferenceServiceException
	 *             Thrown on error while fetching rooms.
	 */
	List<Room> getAllRooms() throws Exception;
}