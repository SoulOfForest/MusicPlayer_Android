package com.example.musicapp.Service;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public interface FirebaseReference {
    DatabaseReference DATABASE_REFERENCE_MUSIC = FirebaseDatabase.getInstance().getReference("music");
    DatabaseReference DATABASE_REFERENCE_PLAYLIST = FirebaseDatabase.getInstance().getReference("playlist");
<<<<<<< HEAD
=======
    DatabaseReference DATABASE_REFERENCE_ALBUM = FirebaseDatabase.getInstance().getReference("albums");
    DatabaseReference DATABASE_REFERENCE_USERS = FirebaseDatabase.getInstance().getReference("users");
>>>>>>> a2974ca6f5a1946b68138c407b95de2c91553508
    FirebaseStorage storage = FirebaseStorage.getInstance();
    // [START download_create_reference]
    // Create a storage reference from our app
    StorageReference STORAGE_REFERENCE = storage.getReference();
}
