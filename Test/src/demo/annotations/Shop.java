package demo.annotations;

@BusinessPolicies({
        @BusinessPolicy(name="Retention Policy", countries = "GB", value = "4 weeks"),
        @BusinessPolicy(countries = {"GB","US"},value = "all values are here")
})
public class Shop {

}
