# 🎯 Montecarlo PI Approximation

This project implements an **iterative Monte Carlo method** to approximate the value of **π (pi)**.

---

## 🚀 How it Works
- The Monte Carlo method generates **random points** inside a square.
- It counts how many points **fall inside the unit circle**.
- The ratio of points inside the circle to total points is used to approximate **π**.

---

## 🔧 Installation & Compilation

### 1️⃣ **Clone the Repository**
```sh
git clone https://github.com/pouriasllm/Montecarlo-PI.git
cd Montecarlo-PI
javac -d bin src/Practice1.java src/Practice1Main.java
java -cp bin Practice1Main 1000000
