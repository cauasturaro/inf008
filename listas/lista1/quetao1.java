class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact(String name, String phone, String email) {
        this(name, phone);
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String displayInfo() {
        return this.name + " - " + this.phone + " - " + this.email;
    }

    public void updateContact(String phone, String email) { 
        this.phone = phone;
        this.email = email;
    }
}

class AddressBook {
    Contact list[] = new Contact[10];

    // public AddressBook() {} implícito

    public void addContact(Contact contact) {
        if (!(list[list.length - 1] == null)) {
            return;
        }

        for (int i = 0; i < list.length; ++i) {
            if(list[i] == null) {
                list[i] = contact;
                return;
            }
        }
    }

    public Contact searchContact(String name){
        for (Contact currentContact : list) {
            if(currentContact.getName() == name) 
                return currentContact;
        }
        return null;
    }

    public void listContacts() {
        for (Contact currentContact : list) {
            if(currentContact == null) 
                return;
            System.out.println(currentContact.displayInfo());
        }
    }
}

class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("caua", "3912873921", "example@email.com"); 
        System.out.println(contact1.displayInfo());
        contact1.updateContact("391287392112", "example@mail.com");

        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact1);
        addressBook.listContacts();
        System.out.println(addressBook.searchContact("caua").displayInfo());
    }
}

