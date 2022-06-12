use std::time::Duration;
use std::thread::sleep;

fn main() {
	let mut a = 1000;
	let b = 7;
	while a > b {
		let c = a - b;
		println!("{} - {} = {}", a, b, c);
		a = c;
		sleep(Duration::from_millis(10));
	}
	println!("I'm ghul!")
}
