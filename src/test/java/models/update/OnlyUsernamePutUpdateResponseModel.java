package models.update;

import java.util.List;

public record OnlyUsernamePutUpdateResponseModel(List<String> firstName, List<String> lastName, List<String> email) {
}
