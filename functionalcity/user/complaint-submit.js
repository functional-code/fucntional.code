

    function addComplaint() {
      const name = document.getElementById("name").value;
      const title = document.getElementById("title").value;
      const category = document.getElementById("category").value;
      const location = document.getElementById("location").value;
      const status = document.getElementById("status").value;

      if (!name || !title || !category || !location || !status) {
        alert("⚠️ Please fill out all fields!");
        return;
      }

      const tableBody = document.getElementById("complaintTable").getElementsByTagName("tbody")[0];
      const newRow = tableBody.insertRow();

      newRow.insertCell(0).textContent = name;
      newRow.insertCell(1).textContent = title;
      newRow.insertCell(2).textContent = category;
      newRow.insertCell(3).textContent = location;
      newRow.insertCell(4).textContent = status;

      // clear inputs
      document.getElementById("name").value = "";
      document.getElementById("title").value = "";
      document.getElementById("category").value = "";
      document.getElementById("location").value = "";
      document.getElementById("status").value = "";
    }
  