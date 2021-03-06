package at.bitfire.davdroid.ical4j;

import java.util.List;

import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.vcard.Group;
import net.fortuna.ical4j.vcard.Parameter;
import net.fortuna.ical4j.vcard.Property;
import net.fortuna.ical4j.vcard.PropertyFactory;

public class PhoneticMiddleName extends Property {
	private static final long serialVersionUID = 1310410178765057503L;

	public static final String PROPERTY_NAME = "PHONETIC-MIDDLE-NAME";
	
	protected String phoneticFirstName;
	
	
	public PhoneticMiddleName(String value) {
		super(PROPERTY_NAME);
		
		phoneticFirstName = value;
	}
	

	@Override
	public String getValue() {
		return phoneticFirstName;
	}

	@Override
	public void validate() throws ValidationException {
	}
	
	public static class Factory implements PropertyFactory<Property> {
		@Override
		public PhoneticMiddleName createProperty(List<Parameter> params, String value) {
			return new PhoneticMiddleName(value);
		}

		@Override
		public PhoneticMiddleName createProperty(Group group, List<Parameter> params, String value) {
			return new PhoneticMiddleName(value);
		}
	}
}
