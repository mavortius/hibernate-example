package hibernate.example

import grails.test.mixin.TestFor
import grails.test.hibernate.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Product)
class ProductSpec extends HibernateSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test domain class validation"() {
        when:"A domain class is saved with invalid data"
        Product product = new Product(name: "", price: -2.0d)
        product.save()

        then:"There were errors and the data was not saved"
        product.hasErrors()
        product.errors.getFieldError('price')
        product.errors.getFieldError('name')
        Product.count() == 0
    }
}
