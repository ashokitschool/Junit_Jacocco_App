package in.ashokit.service;

import java.util.Map;

import in.ashokit.bindings.User;

public interface RegistrationService {

	public boolean uniqueEmail(String email);

	public Map<Integer, String> getCountries();

	public Map<Integer, String> getStates(Integer countryId);

	public Map<Integer, String> getCities(Integer stateId);

	public boolean registerUser(User user);

}