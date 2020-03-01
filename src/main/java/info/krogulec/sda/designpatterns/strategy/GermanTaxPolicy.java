package info.krogulec.sda.designpatterns.strategy;

/**
 * @author krogulecp
 */
class GermanTaxPolicy implements TaxPolicy {
    @Override
    public double getTax() {
        return 0.21;
    }
}
