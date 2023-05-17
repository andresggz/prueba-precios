package andres.grisales.gonzalez.pruebaprecios.component.price.model;

public enum PriceCurrency {
    EUR("Euro");

    private final String displayName;

    PriceCurrency(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
