package models.update;

import java.util.List;

public record WrongFieldsPatchUpdateResponseModel(List<String> username, List<String> firstName, List<String> lastName, List<String> email) {
}
