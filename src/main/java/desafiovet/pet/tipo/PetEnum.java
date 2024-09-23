package desafiovet.pet.tipo;

public enum PetEnum {
    CANINO("1"), FELINO("2"), REPTIL("3"), AVE("4"), OUTRO("0");

    private final String id;

    PetEnum(String id) {
        this.id = id;
    }

    public String getTipo() {
        return this.id;
    }

    public static PetEnum fromId(String id) {
        for (PetEnum tipo : values()) {
            if (tipo.getTipo().equals(id)) {
                return tipo;
            }
        }
        return OUTRO;
    }
}