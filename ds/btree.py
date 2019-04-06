class node:
	def __init__(self,key):
		self.left=None
		self.right=None
		self.val=key

def inorder(root):
	if root:
		inorder(root.left)
		print(root.val),
		inorder(root.right)

def postorder(root):
	if root:
		postorder(root.left)
		postorder(root.right)
		print(root.val),

def preorder(root):
	if root:
		print(root.val),
		preorder(root.left)
		preorder(root.right)

root=node(1)
root.left=node(2)
root.right=node(3)
root.left.left=node(4)
root.right.right=node(5)

print("inorder:"),
inorder(root)

print("\npreorder:"),
preorder(root)

print("\npostorder:"),
postorder(root)
