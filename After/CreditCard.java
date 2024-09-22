import lombok.Data;

@Data // a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
public class CreditCard {

    private int amount = 1_000;
    private final String number = null;
    private final String date = null;
    private final String cvv = null;

}