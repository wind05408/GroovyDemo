/**
 * Created by Administrator on 2016/1/29.
 */
Book gina = new Book('Groovy in Action')
assert gina.getTitle() == 'Groovy in Action'
assert getTitleBackwards(gina) == 'noitcA ni yvoorG'
String getTitleBackwards(book) {
    title = book.getTitle()

    return title.reverse()
}
