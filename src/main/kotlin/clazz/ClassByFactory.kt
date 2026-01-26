package clazz

class ClassByFactory private constructor(val name: String) {
    companion object {
        fun create(args: Array<String>): ClassByFactory? {
            val name = args.firstOrNull() ?: return null

            return ClassByFactory(name)
        }
    }
}