public enum Palo {
    CORAZONES,
    DIAMANTES,
    PICAS,
    TREBOLES;

    @Override
    public String toString() {
        return switch (this) {
            case CORAZONES -> "Corazones";
            case DIAMANTES -> "Diamantes";
            case PICAS -> "Picas";
            case TREBOLES -> "Treboles";
        };
    }

    public static Palo fromString(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Palo no puede ser nulo");
        }
        return switch (value.trim().toUpperCase()) {
            case "CORAZONES" -> CORAZONES;
            case "DIAMANTES" -> DIAMANTES;
            case "PICAS" -> PICAS;
            case "TREBOLES", "TRÉBOLES", "TREBOL" -> TREBOLES;
            default -> throw new IllegalArgumentException("Palo desconocido: " + value);
        };
    }
}
