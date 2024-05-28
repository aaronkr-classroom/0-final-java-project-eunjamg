package com.market.cart;
import java.util.ArrayList;
import com.market.bookitem.Book;

public class Cart implements CartInterface {
	public ArrayList<CartItem> mCartItem = new ArrayList<CartItem>();
	
	//static final int NUM_BOOK = 3;
	//public CartItem[] mCartItem = new CartItem[NUM_BOOK];
	static public int mCartCount = 0;
	
	public Cart() {
		
	}
	
	public ArrayList<CartItem> getmCartItem() {
		return mCartItem;
	}
	
	public void setmCartItem(ArrayList<CartItem> mCartItem) {
		this.mCartItem = mCartItem;
	}
	
	public void printBookList(ArrayList<Book> booklist) {
		for (int i = 0; i < booklist.size(); i++) {
			Book bookitem = booklist.get(i);
			System.out.println(bookitem.getBookId() + " | ");
			System.out.println(bookitem.getName() + " | ");
			System.out.println(bookitem.getUnitPrice() + " | ");
			System.out.println(bookitem.getAuthor() + " | ");
			System.out.println(bookitem.getDescription() + " | ");
			System.out.println(bookitem.getCategory() + " | ");
			System.out.println(bookitem.getReleaseDate());
			System.out.println("");
		}
	}
	
	public void insertBook(Book book) {
		//mCartItem[mCartCount++] = new CartItem(book);
		CartItem bookitem = new CartItem(book);
		mCartItem.add(bookitem);
		mCartCount = mCartItem.size();
	}
	
	public void deleteBook() {
		//mCartItem = new CartItem[NUM_BOOK];
		mCartItem.clear();
		mCartCount = 0;
	}
	
	public void printCart() {
		System.out.println("장바구니 상품 목록");
		System.out.println("------------------------------------------");
		System.out.println("	도서ID \t|    수량 \t|    합계");
		for (int i = 0; i < mCartItem.size(); i++) {
			System.out.println("	" + mCartItem.get(i).getBookID() + " \t| ");
			System.out.println("	" + mCartItem.get(i).getQuantity() + " \t| ");
			System.out.println("	" + mCartItem.get(i).getTotalPrice());
		}
		System.out.println("------------------------------------------");
	}
	
	public boolean isCartInBook(String bookId) {
		boolean flag = false;
		for (int i = 0; i < mCartItem.size(); i++) {
			if (bookId == mCartItem.get(i).getBookID()) {
				mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity() + 1);
				flag = true;
			}
		}
		return flag;
	}
	
	public void removeCart(int numId) {
		/*CartItem[] cartItem = new CartItem[NUM_BOOK];
		int num = 0;
		
		for (int i = 0; i < mCartCount; i++) {
			if (numId != i) {
				cartItem[num++] = mCartItem[i];
			}
		}
		
		mCartCount = num;
		mCartItem = cartItem;*/
		mCartItem.remove(numId);
		mCartCount = mCartItem.size();
	}
}