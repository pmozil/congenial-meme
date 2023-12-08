package com.task2;

public class Stamping {
    public static <T> Group<T> stamp(Group<T> group) {
        for (Task<T> task : group.getTasks()) {
            if (task instanceof Signature) {
                Signature<T> signature = (Signature<T>) task;
                signature.setHeader("groupId", group.getGroupUuid());
            } else if (task instanceof Group) {
                stamp((Group<T>) task);
            }
        }
        return group;
    }
}

