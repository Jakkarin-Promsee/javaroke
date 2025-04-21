package utils;

public class Validator {
    public static void validateSongId(String songId) {
        if (songId.contains(" ")) {
            throw new IllegalArgumentException("Invalid songId format: " + songId + "\nIt shouldn't have spaces.");
        }
    }

    public static void validateTimeForm(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("Invalid time format: " + time + "\nExpected format mm:ss");
        }
    }
}
