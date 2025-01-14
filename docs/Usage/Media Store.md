## Import package

```dart
import 'package:shared_storage/media_store.dart' as mediastore;
```

> **Note** Be aware that if you import the package `import '...' as mediastore;` (strongly recommended) you should prefix all method calls with `mediastore`, example:

```dart
mediastore.getMediaStoreContentDirectory(...);
```

But if you import without alias `import '...';` (Not recommeded because can conflict with other method/package names) you should use directly as functions:

```dart
getMediaStoreContentDirectory(...);
```

## API reference

Original API. These methods exists only in this package.

Because methods are an abstraction from native API, for example: `getMediaStoreContentDirectory` is an abstraction because there's no such method in native Android, there you can access these directories synchronously and directly from the `MediaStore` nested classes which is not the goal of this package (re-create all Android APIs) but provide a powerful fully-configurable API to call these APIs.

### <samp>getMediaStoreContentDirectory</samp>

Get the **directory** of a given Media Store Collection.

The directory follows the **Uri** format

To see all available collections see `MediaStoreCollection` class

```dart
final Uri directory = getMediaStoreContentDirectory(MediaStoreCollection.downloads);
```

## Android Official Documentation

The **Media Store** [official documentation is available here.](https://developer.android.com/reference/android/provider/MediaStore)

All the APIs listed in this plugin module are derivated from the official docs.
